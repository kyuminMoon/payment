package com.tistory.kmmoon.auth.application.port.out

import com.tistory.kmmoon.user.UserEntity
import com.tistory.kmmoon.user.domain.User

interface AuthLoginPort {
  fun login(email: String, password: String): UserEntity?
}