</br>

## ✳️ branch 설명
**Feature (필요시 생성)**
- 하나의 기능 개발을 위한 브랜치
- `dev` 에서 생성 > 개발 완료 시 `dev` 로 `merge`
- Merge시, Fast-Forward로 merge하지 않고 Merge Commit을 생성해 merge해야 함. → 히스토리가 특정 기능 단위로 묶이게 됨
- ✅naming : `feature/{branch-name}`

</br>

# Mimoo : Mind & Mood 감정 일기 앱
**Mimoo**는 심리적 상태(Mind)와 감정의 흐름(Mood)의 합성어로, 사용자가 매일 자신의 감정을 기록(텍스트 입력, 음성 입력) 하고, AI로 감정 분석 및 피드백을 통해 위로·코칭을 받는 정서관리 앱입니다.

</br>

## ✅ 핵심 기능
- **감정일기 작성**: 텍스트 입력 (확장 예정: 음성 인식)
- **AI 감정 분석**: 감정 요약, 키워드 추출, 공감 메시지 제공
- **감정 리포트**: 주간/월간/연간 감정 변화 시각화 및 통계
- **설정/확장 기능**: 일기 작성 알림, 다크모드, 캐릭터 테마, 계정관리 등

</br>

## 💡 핵심 가치
1. 감정을 기록하며 **정서적 회고**
2. AI와의 대화를 통한 **감정적 동반자 경험**
3. **시각화된 감정 패턴**으로 자기 인식 강화

</br>

## 🛠 기술 스택
| 영역 | 사용 기술 |
|------|-----------|
| 언어 | Kotlin |
| UI | Jetpack Compose + Material3 + 다크모드 |
| 아키텍처 | Clean Architecture + Hilt + MVI |
| 데이터 관리 | Room, DataStore, Firebase Firestore |
| 감정 분석 | 온디바이스 모델 또는 API (ChatGPT, firebender, Gemini 등) |
| 시각화 | Compose Charts / MPAndroidChart |
| 테스트 | JUnit5, Mockito (ViewModel/UseCase 단위 테스트) |
| CI/CD | GitHub Actions, Bitrise, Firebase App Distribution |
| 모니터링 | Firebase Crashlytics, Firebase Analytics |

</br>

## 🎯 타겟
- 감정 표현이 어려운 20~40대  
- 자기 관리와 정서 정리에 관심있는 사용자

</br>

## 🧪 확장 기능 아이디어
- 음성 기반 일기
- 감정 요약 한줄 생성
- 사용자 계정 및 데이터 백업

</br>

## 🚀 실행 방법 (추후 수정 필요)

```bash
# 1. 프로젝트 클론
git clone https://github.com/MIND-MOOD/mimoo.git
cd mimoo

# 2. Android Studio로 열기
# (Gradle sync 필요 / 최소 SDK 및 JDK 버전: TBD)
