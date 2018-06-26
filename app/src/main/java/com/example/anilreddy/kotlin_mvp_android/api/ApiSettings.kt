package com.example.anilreddy.kotlin_mvp_android.api

object ApiSettings {
    const val PATH_ORGANIZATION = "organization"
    const val PARAM_REPOS_TYPE = "type"

    const val PATH_REPO = "repo"
    const val PATH_OWNER = "owner"

    const val ORGANIZATION_REPOS = "orgs/{$PATH_ORGANIZATION}/repos"
    const val REPOSITORY = "/repos/{$PATH_OWNER}/{$PATH_REPO}"
}