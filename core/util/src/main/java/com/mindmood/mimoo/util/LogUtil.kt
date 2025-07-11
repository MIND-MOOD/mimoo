package com.mindmood.mimoo.util

import android.util.Log
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onEach

object LogUtil {
    private const val TAG = "Mimoo"
    private const val MAX_TAG_LENGTH = 23
    private const val MAX_MESSAGE_LENGTH = 4000
    
    private var isDebugMode = true
    private var isLoggingEnabled = true
    
    fun setDebugMode(enabled: Boolean) {
        isDebugMode = enabled
    }
    
    fun setLoggingEnabled(enabled: Boolean) {
        isLoggingEnabled = enabled
    }
    
    fun d(message: String, tag: String = TAG) {
        if (isLoggingEnabled && isDebugMode) {
            val truncatedMessage = message.take(MAX_MESSAGE_LENGTH)
            val truncatedTag = tag.take(MAX_TAG_LENGTH)
            Log.d(truncatedTag, truncatedMessage)
        }
    }
    
    fun i(message: String, tag: String = TAG) {
        if (isLoggingEnabled) {
            val truncatedMessage = message.take(MAX_MESSAGE_LENGTH)
            val truncatedTag = tag.take(MAX_TAG_LENGTH)
            Log.i(truncatedTag, truncatedMessage)
        }
    }
    
    fun w(message: String, tag: String = TAG) {
        if (isLoggingEnabled) {
            val truncatedMessage = message.take(MAX_MESSAGE_LENGTH)
            val truncatedTag = tag.take(MAX_TAG_LENGTH)
            Log.w(truncatedTag, truncatedMessage)
        }
    }
    
    fun e(message: String, throwable: Throwable? = null, tag: String = TAG) {
        if (isLoggingEnabled) {
            val truncatedMessage = message.take(MAX_MESSAGE_LENGTH)
            val truncatedTag = tag.take(MAX_TAG_LENGTH)
            if (throwable != null) {
                Log.e(truncatedTag, truncatedMessage, throwable)
            } else {
                Log.e(truncatedTag, truncatedMessage)
            }
        }
    }
    
    fun v(message: String, tag: String = TAG) {
        if (isLoggingEnabled && isDebugMode) {
            val truncatedMessage = message.take(MAX_MESSAGE_LENGTH)
            val truncatedTag = tag.take(MAX_TAG_LENGTH)
            Log.v(truncatedTag, truncatedMessage)
        }
    }
    
    // 성능 측정을 위한 유틸리티
    inline fun <T> measureTimeMillis(operation: String, block: () -> T): T {
        val startTime = System.currentTimeMillis()
        return try {
            block()
        } finally {
            val endTime = System.currentTimeMillis()
            d("$operation took ${endTime - startTime}ms")
        }
    }
    
    // 코루틴 예외 핸들러
    fun createExceptionHandler(tag: String = TAG): CoroutineExceptionHandler {
        return CoroutineExceptionHandler { _, throwable ->
            e("Coroutine exception occurred", throwable, tag)
        }
    }
    
    // Flow 로깅 확장 함수
    fun <T> Flow<T>.logFlow(operation: String, tag: String = TAG): Flow<T> {
        return this
            .onEach { value ->
                d("$operation: $value", tag)
            }
            .catch { throwable ->
                e("$operation failed", throwable, tag)
                throw throwable
            }
    }
    
    // 메모리 사용량 로깅
    fun logMemoryUsage(tag: String = TAG) {
        val runtime = Runtime.getRuntime()
        val usedMemory = runtime.totalMemory() - runtime.freeMemory()
        val maxMemory = runtime.maxMemory()
        
        d("Memory usage: ${usedMemory / 1024 / 1024}MB / ${maxMemory / 1024 / 1024}MB", tag)
    }
    
    // 스택 트레이스 로깅 (디버그용)
    fun logStackTrace(tag: String = TAG) {
        if (isDebugMode) {
            val stackTrace = Thread.currentThread().stackTrace
            val relevantFrames = stackTrace.take(5)
            val stackTraceString = relevantFrames.joinToString("\n") { 
                "  at ${it.className}.${it.methodName}(${it.fileName}:${it.lineNumber})" 
            }
            d("Stack trace:\n$stackTraceString", tag)
        }
    }
    
    // API 호출 로깅
    fun logApiCall(url: String, method: String, tag: String = TAG) {
        d("API Call: $method $url", tag)
    }
    
    fun logApiResponse(url: String, statusCode: Int, responseTime: Long, tag: String = TAG) {
        val status = when {
            statusCode in 200..299 -> "SUCCESS"
            statusCode in 400..499 -> "CLIENT_ERROR"
            statusCode in 500..599 -> "SERVER_ERROR"
            else -> "UNKNOWN"
        }
        d("API Response: $status ($statusCode) - ${responseTime}ms - $url", tag)
    }
    
    // 데이터베이스 작업 로깅
    fun logDatabaseOperation(operation: String, table: String, tag: String = TAG) {
        d("DB $operation on $table", tag)
    }
    
    // UI 이벤트 로깅
    fun logUiEvent(event: String, tag: String = TAG) {
        d("UI Event: $event", tag)
    }
    
    // 사용자 액션 로깅
    fun logUserAction(action: String, tag: String = TAG) {
        d("User Action: $action", tag)
    }
    
    // 에러 통계
    private val errorCounts = mutableMapOf<String, Int>()
    
    fun logErrorWithCount(errorType: String, message: String, throwable: Throwable? = null, tag: String = TAG) {
        val count = errorCounts.getOrPut(errorType) { 0 } + 1
        errorCounts[errorType] = count
        
        val messageWithCount = "$message (count: $count)"
        e(messageWithCount, throwable, tag)
    }
    
    fun getErrorStats(): Map<String, Int> {
        return errorCounts.toMap()
    }
    
    fun clearErrorStats() {
        errorCounts.clear()
    }
} 