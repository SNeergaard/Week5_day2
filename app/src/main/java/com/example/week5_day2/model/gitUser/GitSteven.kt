package com.example.week5_day2.model.gitUser

import com.google.gson.annotations.SerializedName

class GitSteven {

    @SerializedName("gists_url")
    private var gistsUrl: String? = null

    @SerializedName("repos_url")
    private var reposUrl: String? = null

    @SerializedName("following_url")
    private var followingUrl: String? = null

    @SerializedName("bio")
    private var bio: Any? = null

    @SerializedName("created_at")
    private var createdAt: String? = null

    @SerializedName("login")
    private var login: String? = null

    @SerializedName("type")
    private var type: String? = null

    @SerializedName("blog")
    private var blog: String? = null

    @SerializedName("subscriptions_url")
    private var subscriptionsUrl: String? = null

    @SerializedName("updated_at")
    private var updatedAt: String? = null

    @SerializedName("site_admin")
    private var siteAdmin: Boolean = false

    @SerializedName("company")
    private var company: Any? = null

    @SerializedName("id")
    private var id: Int = 0

    @SerializedName("public_repos")
    private var publicRepos: Int = 0

    @SerializedName("gravatar_id")
    private var gravatarId: String? = null

    @SerializedName("email")
    private var email: Any? = null

    @SerializedName("organizations_url")
    private var organizationsUrl: String? = null

    @SerializedName("hireable")
    private var hireable: Any? = null

    @SerializedName("starred_url")
    private var starredUrl: String? = null

    @SerializedName("followers_url")
    private var followersUrl: String? = null

    @SerializedName("public_gists")
    private var publicGists: Int = 0

    @SerializedName("url")
    private var url: String? = null

    @SerializedName("received_events_url")
    private var receivedEventsUrl: String? = null

    @SerializedName("followers")
    private var followers: Int = 0

    @SerializedName("avatar_url")
    private var avatarUrl: String? = null

    @SerializedName("events_url")
    private var eventsUrl: String? = null

    @SerializedName("html_url")
    private var htmlUrl: String? = null

    @SerializedName("following")
    private var following: Int = 0

    @SerializedName("name")
    private var name: Any? = null

    @SerializedName("location")
    private var location: Any? = null

    @SerializedName("node_id")
    private var nodeId: String? = null

    fun setGistsUrl(gistsUrl: String) {
        this.gistsUrl = gistsUrl
    }

    fun getGistsUrl(): String? {
        return gistsUrl
    }

    fun setReposUrl(reposUrl: String) {
        this.reposUrl = reposUrl
    }

    fun getReposUrl(): String? {
        return reposUrl
    }

    fun setFollowingUrl(followingUrl: String) {
        this.followingUrl = followingUrl
    }

    fun getFollowingUrl(): String? {
        return followingUrl
    }

    fun setBio(bio: Any) {
        this.bio = bio
    }

    fun getBio(): Any? {
        return bio
    }

    fun setCreatedAt(createdAt: String) {
        this.createdAt = createdAt
    }

    fun getCreatedAt(): String? {
        return createdAt
    }

    fun setLogin(login: String) {
        this.login = login
    }

    fun getLogin(): String? {
        return login
    }

    fun setType(type: String) {
        this.type = type
    }

    fun getType(): String? {
        return type
    }

    fun setBlog(blog: String) {
        this.blog = blog
    }

    fun getBlog(): String? {
        return blog
    }

    fun setSubscriptionsUrl(subscriptionsUrl: String) {
        this.subscriptionsUrl = subscriptionsUrl
    }

    fun getSubscriptionsUrl(): String? {
        return subscriptionsUrl
    }

    fun setUpdatedAt(updatedAt: String) {
        this.updatedAt = updatedAt
    }

    fun getUpdatedAt(): String? {
        return updatedAt
    }

    fun setSiteAdmin(siteAdmin: Boolean) {
        this.siteAdmin = siteAdmin
    }

    fun isSiteAdmin(): Boolean {
        return siteAdmin
    }

    fun setCompany(company: Any) {
        this.company = company
    }

    fun getCompany(): Any? {
        return company
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getId(): Int {
        return id
    }

    fun setPublicRepos(publicRepos: Int) {
        this.publicRepos = publicRepos
    }

    fun getPublicRepos(): Int {
        return publicRepos
    }

    fun setGravatarId(gravatarId: String) {
        this.gravatarId = gravatarId
    }

    fun getGravatarId(): String? {
        return gravatarId
    }

    fun setEmail(email: Any) {
        this.email = email
    }

    fun getEmail(): Any? {
        return email
    }

    fun setOrganizationsUrl(organizationsUrl: String) {
        this.organizationsUrl = organizationsUrl
    }

    fun getOrganizationsUrl(): String? {
        return organizationsUrl
    }

    fun setHireable(hireable: Any) {
        this.hireable = hireable
    }

    fun getHireable(): Any? {
        return hireable
    }

    fun setStarredUrl(starredUrl: String) {
        this.starredUrl = starredUrl
    }

    fun getStarredUrl(): String? {
        return starredUrl
    }

    fun setFollowersUrl(followersUrl: String) {
        this.followersUrl = followersUrl
    }

    fun getFollowersUrl(): String? {
        return followersUrl
    }

    fun setPublicGists(publicGists: Int) {
        this.publicGists = publicGists
    }

    fun getPublicGists(): Int {
        return publicGists
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getUrl(): String? {
        return url
    }

    fun setReceivedEventsUrl(receivedEventsUrl: String) {
        this.receivedEventsUrl = receivedEventsUrl
    }

    fun getReceivedEventsUrl(): String? {
        return receivedEventsUrl
    }

    fun setFollowers(followers: Int) {
        this.followers = followers
    }

    fun getFollowers(): Int {
        return followers
    }

    fun setAvatarUrl(avatarUrl: String) {
        this.avatarUrl = avatarUrl
    }

    fun getAvatarUrl(): String? {
        return avatarUrl
    }

    fun setEventsUrl(eventsUrl: String) {
        this.eventsUrl = eventsUrl
    }

    fun getEventsUrl(): String? {
        return eventsUrl
    }

    fun setHtmlUrl(htmlUrl: String) {
        this.htmlUrl = htmlUrl
    }

    fun getHtmlUrl(): String? {
        return htmlUrl
    }

    fun setFollowing(following: Int) {
        this.following = following
    }

    fun getFollowing(): Int {
        return following
    }

    fun setName(name: Any) {
        this.name = name
    }

    fun getName(): Any? {
        return name
    }

    fun setLocation(location: Any) {
        this.location = location
    }

    fun getLocation(): Any? {
        return location
    }

    fun setNodeId(nodeId: String) {
        this.nodeId = nodeId
    }

    fun getNodeId(): String? {
        return nodeId
    }

    override fun toString(): String {
        return "GitSteven{" +
                "gists_url = '" + gistsUrl + '\''.toString() +
                ",repos_url = '" + reposUrl + '\''.toString() +
                ",following_url = '" + followingUrl + '\''.toString() +
                ",bio = '" + bio + '\''.toString() +
                ",created_at = '" + createdAt + '\''.toString() +
                ",login = '" + login + '\''.toString() +
                ",type = '" + type + '\''.toString() +
                ",blog = '" + blog + '\''.toString() +
                ",subscriptions_url = '" + subscriptionsUrl + '\''.toString() +
                ",updated_at = '" + updatedAt + '\''.toString() +
                ",site_admin = '" + siteAdmin + '\''.toString() +
                ",company = '" + company + '\''.toString() +
                ",id = '" + id + '\''.toString() +
                ",public_repos = '" + publicRepos + '\''.toString() +
                ",gravatar_id = '" + gravatarId + '\''.toString() +
                ",email = '" + email + '\''.toString() +
                ",organizations_url = '" + organizationsUrl + '\''.toString() +
                ",hireable = '" + hireable + '\''.toString() +
                ",starred_url = '" + starredUrl + '\''.toString() +
                ",followers_url = '" + followersUrl + '\''.toString() +
                ",public_gists = '" + publicGists + '\''.toString() +
                ",url = '" + url + '\''.toString() +
                ",received_events_url = '" + receivedEventsUrl + '\''.toString() +
                ",followers = '" + followers + '\''.toString() +
                ",avatar_url = '" + avatarUrl + '\''.toString() +
                ",events_url = '" + eventsUrl + '\''.toString() +
                ",html_url = '" + htmlUrl + '\''.toString() +
                ",following = '" + following + '\''.toString() +
                ",name = '" + name + '\''.toString() +
                ",location = '" + location + '\''.toString() +
                ",node_id = '" + nodeId + '\''.toString() +
                "}"
    }

}