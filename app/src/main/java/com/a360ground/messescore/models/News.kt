package com.a360ground.messescore.models

import com.google.gson.annotations.SerializedName

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by Kiyos Solomon on 2/26/2017.
 */

open class News : RealmObject() {


    /**
     * id : 48
     * title : አርሰናሎች ይህ የውድድር ዘመን የቀናቸው ይመስላል 3 ተከታታይ ጨዋታዎች አሸንፈዋል
     * link : http://localhost/KiyosScore/2017/02/25/arsenal-are-about-to-loose-the-game/
     * content :
     *
     *Lorem ipsum dollor set amet consequtore

     * featured_image_url : http://localhost/KiyosScore/wp-content/uploads/2017/02/arsenal.jpg
     * categories : [19]
     * tags : []
     */

    @SerializedName("id")
    @PrimaryKey
    var id: Int = 0
    @SerializedName("title")
    var title: String? = null
    @SerializedName("link")
    var link: String? = null
    @SerializedName("content")
    var content: String? = null
    @SerializedName("featured_image_url")
    var featuredImageUrl: String? = null
    @SerializedName("categories")
    var categories: String? = null
    @SerializedName("tags")
    var tags: String? = null
    @SerializedName("category_name")
    var categoryName: String? = null
}
