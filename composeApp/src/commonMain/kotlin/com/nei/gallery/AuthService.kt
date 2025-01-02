package com.nei.gallery

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.GoogleAuthProvider
import dev.gitlive.firebase.auth.auth

class AuthService {
    suspend fun google(idToken: String?, accessToken: String?) {
        val authCredential = GoogleAuthProvider.credential(idToken, accessToken)
        Firebase.auth.signInWithCredential(authCredential)
    }
}