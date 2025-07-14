## 📌 Git Branch 전략

이 프로젝트는 Git Flow를 기반으로 한 브랜치 전략을 따릅니다.

---

### ✅ 브랜치 종류 및 목적

| 브랜치 | 설명 | 병합 대상 |
|--------|------|-----------|
| `main` | 운영에 배포된 최종 안정 코드 | `release`, `hotfix` |
| `dev` | 다음 버전 개발을 위한 통합 브랜치 | `feature`, `release`, `hotfix` |
| `feature/*` | 단일 기능 개발 브랜치 | `dev` |
| `release/*` | 배포 준비용 브랜치 | `main`, `dev` |
| `hotfix/*` | 운영 버그 수정 브랜치 | `main`, `dev` |

---

### ✅ 브랜치 생성 규칙

- `feature/*` : 기능 단위 개발 시 생성 (마크다우예: `feature/login-api`)
- `release/*` : 릴리즈 준비 시 생성 (예: `release/v1.0.0`)
- `hotfix/*` : 운영 중 긴급 수정 시 생성 (예: `hotfix/v1.0.1`)

### ✅ 브랜치 운영 흐름

#### 1. 프로젝트 초기화
- `main`, `dev` 브랜치 체크아웃


#### 2. 기능 개발
- `dev` 브랜치를 Base 로 `feature/*` 브랜치 생성 및 checkout

##### ➡️ 작업후, `dev` 로 merge


#### 3. 릴리즈 준비
- `dev` 를 Base 로 `release/v.1.0.0` 브랜치 생성 및 checkout

##### ➡️ QA, 버그 수정 후 `dev`, `main` 으로 merge


####4. hotfix 처리
- `main` 을 Base 로 `hotfix/v1.0.1` 브랜치 생성 및 checkout

##### ➡️ 수정 후 `main`, `dev` 에 merge