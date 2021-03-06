package pl.radoslawdabrowski.admin.utils.const

class Paths {

    companion object {
        const val DASHBOARD = "/"
        const val EDUCATION = "/education"
        const val EXPERIENCE = "/experience"
        const val BLOG = "/blog"
        const val PORTFOLIO = "/portfolio"
        const val REFERENCES = "/references"
        const val ABOUT = "/about"
        const val ATTRIBUTES = "/attributes"
        const val LOGIN = "/login"
        const val LOGOUT = "/logout"
        const val PASSWORD = "/password"
        const val PASSWORD_RESET = "$PASSWORD/reset"
        const val PASSWORD_CHANGE = "$PASSWORD/change/{token}"
    }

}
