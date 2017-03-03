package com.a360ground.messescore.models

/**
 * Created by Kiyos Solomon on 2/24/2017.
 */

class Player {


    @com.google.gson.annotations.SerializedName("id")
    private val id: Int = 0
    @com.google.gson.annotations.SerializedName("date")
    private val date: String? = null
    @com.google.gson.annotations.SerializedName("date_gmt")
    private val dateGmt: String? = null
    @com.google.gson.annotations.SerializedName("guid")
    private val guid: GuidModel? = null
    @com.google.gson.annotations.SerializedName("modified")
    private val modified: String? = null
    @com.google.gson.annotations.SerializedName("modified_gmt")
    private val modifiedGmt: String? = null
    @com.google.gson.annotations.SerializedName("slug")
    private val slug: String? = null
    @com.google.gson.annotations.SerializedName("type")
    private val type: String? = null
    @com.google.gson.annotations.SerializedName("link")
    private val link: String? = null
    @com.google.gson.annotations.SerializedName("title")
    private val title: TitleModel? = null
    @com.google.gson.annotations.SerializedName("content")
    private val content: ContentModel? = null
    @com.google.gson.annotations.SerializedName("excerpt")
    private val excerpt: ExcerptModel? = null
    @com.google.gson.annotations.SerializedName("author")
    private val author: Int = 0
    @com.google.gson.annotations.SerializedName("featured_media")
    private val featuredMedia: Int = 0
    @com.google.gson.annotations.SerializedName("menu_order")
    private val menuOrder: Int = 0
    @com.google.gson.annotations.SerializedName("template")
    private val template: String? = null
    @com.google.gson.annotations.SerializedName("number")
    private val number: Int = 0
    @com.google.gson.annotations.SerializedName("statistics")
    private val statistics: StatisticsModel? = null
    @com.google.gson.annotations.SerializedName("_links")
    private val links: LinksModel? = null
    @com.google.gson.annotations.SerializedName("leagues")
    private val leagues: List<Int>? = null
    @com.google.gson.annotations.SerializedName("seasons")
    private val seasons: List<Int>? = null
    @com.google.gson.annotations.SerializedName("positions")
    private val positions: List<*>? = null
    @com.google.gson.annotations.SerializedName("teams")
    private val teams: List<Int>? = null
    @com.google.gson.annotations.SerializedName("current_teams")
    private val currentTeams: List<Int>? = null
    @com.google.gson.annotations.SerializedName("past_teams")
    private val pastTeams: List<*>? = null
    @com.google.gson.annotations.SerializedName("nationalities")
    private val nationalities: List<String>? = null
    @com.google.gson.annotations.SerializedName("metrics")
    private val metrics: List<*>? = null

    class GuidModel {
        /**
         * rendered : http://localhost/KiyosScore/?post_type=sp_player&#038;p=12
         */

        @com.google.gson.annotations.SerializedName("rendered")
        var rendered: String? = null
    }

    class TitleModel {
        /**
         * rendered : Alexis Sánchez
         */

        @com.google.gson.annotations.SerializedName("rendered")
        var rendered: String? = null
    }

    class ContentModel {
        /**
         * rendered :
         *
         *Alexis Alejandro Sánchez Sánchez (Spanish pronunciation: [aˈleksis ˈsantʃes]; born 19 December 1988), also known as simply Alexis, is a Chilean professional footballer who plays as a forward for English club Arsenal and the Chilean national team.
         *
         * After his debut season of first-team football with Cobreloa, Sánchez was signed by Italy&#8217;s Udinese in 2006. Following successful loans at Colo-Colo and River Plate, he began playing in Serie A. In 2011, he was signed by Barcelona for £25 million, becoming the most expensive transfer in Chilean football history.[7] Sánchez signed for Arsenal in July 2014 for a fee reported to be £31.7 million, making him the third-most expensive signing in the club&#8217;s history after Mesut Özil and Granit Xhaka.
         *
         * Sánchez, also nicknamed El Niño Maravilla, has been a full international for Chile since 2006, and has earned 100 caps, making him the team&#8217;s second-most capped player of all time after goalkeeper Claudio Bravo. With 36 goals, he is La Roja&#8217;s second highest top scorer of all time. He played in two FIFA World Cups (2010 and 2014) as well as three Copa América tournaments, winning two of the latter.[8]

         * protected : false
         */

        @com.google.gson.annotations.SerializedName("rendered")
        var rendered: String? = null
        @com.google.gson.annotations.SerializedName("protected")
        var isProtectedX: Boolean = false
    }

    class ExcerptModel {
        /**
         * rendered :
         *
         *Alexis Alejandro Sánchez Sánchez (Spanish pronunciation: [aˈleksis ˈsantʃes]; born 19 December 1988), also known as simply Alexis, is a Chilean professional footballer who plays as a forward for English club Arsenal and the Chilean national team. After his debut season of first-team football with Cobreloa, Sánchez was signed by Italy&#8217;s Udinese in 2006. Following successful
         *
         * [Continue reading<span class="screen-reader-text"> &#8220;Alexis Sánchez&#8221;</span>](http://localhost/KiyosScore/player/alexis-sanchez/)

         * protected : false
         */

        @com.google.gson.annotations.SerializedName("rendered")
        var rendered: String? = null
        @com.google.gson.annotations.SerializedName("protected")
        var isProtectedX: Boolean = false
    }

    class StatisticsModel {
        @com.google.gson.annotations.SerializedName("2")
        var `$2`: List<`_$2Model`>? = null

        class `_$2Model` {
            /**
             * name : Season
             * team : Club
             * goals : Goals
             * assists : Assists
             * yellowcards : Yellow Cards
             * redcards : Red Cards
             * appearances : Appearances
             * winratio : Win Ratio
             * drawratio : Draw Ratio
             * lossratio : Loss Ratio
             * owngoals : Own Goals
             */

            @com.google.gson.annotations.SerializedName("name")
            var name: String? = null
            @com.google.gson.annotations.SerializedName("team")
            var team: String? = null
            @com.google.gson.annotations.SerializedName("goals")
            var goals: String? = null
            @com.google.gson.annotations.SerializedName("assists")
            var assists: String? = null
            @com.google.gson.annotations.SerializedName("yellowcards")
            var yellowcards: String? = null
            @com.google.gson.annotations.SerializedName("redcards")
            var redcards: String? = null
            @com.google.gson.annotations.SerializedName("appearances")
            var appearances: String? = null
            @com.google.gson.annotations.SerializedName("winratio")
            var winratio: String? = null
            @com.google.gson.annotations.SerializedName("drawratio")
            var drawratio: String? = null
            @com.google.gson.annotations.SerializedName("lossratio")
            var lossratio: String? = null
            @com.google.gson.annotations.SerializedName("owngoals")
            var owngoals: String? = null
        }
    }

    // FIXME generate failure  field _$WpTerm37
    // FIXME generate failure  field _$WpAttachment213
    // FIXME generate failure  field _$WpFeaturedmedia56
    class LinksModel {
        @com.google.gson.annotations.SerializedName("self")
        var self: List<SelfModel>? = null
        @com.google.gson.annotations.SerializedName("collection")
        var collection: List<CollectionModel>? = null
        @com.google.gson.annotations.SerializedName("about")
        var about: List<AboutModel>? = null
        @com.google.gson.annotations.SerializedName("author")
        var author: List<AuthorModel>? = null
        @com.google.gson.annotations.SerializedName("curies")
        private val curies: List<CuriesModel>? = null

        class SelfModel {
            /**
             * href : http://localhost/KiyosScore/wp-json/sportspress/v2/sp_player/12
             */

            @com.google.gson.annotations.SerializedName("href")
            var href: String? = null
        }

        class CollectionModel {
            /**
             * href : http://localhost/KiyosScore/wp-json/sportspress/v2/sp_player
             */

            @com.google.gson.annotations.SerializedName("href")
            var href: String? = null
        }

        class AboutModel {
            /**
             * href : http://localhost/KiyosScore/wp-json/wp/v2/types/sp_player
             */

            @com.google.gson.annotations.SerializedName("href")
            var href: String? = null
        }

        class AuthorModel {
            /**
             * embeddable : true
             * href : http://localhost/KiyosScore/wp-json/wp/v2/users/1
             */

            @com.google.gson.annotations.SerializedName("embeddable")
            var isEmbeddable: Boolean = false
            @com.google.gson.annotations.SerializedName("href")
            var href: String? = null
        }

        class CuriesModel {
            /**
             * name : wp
             * href : https://api.w.org/{rel}
             * templated : true
             */

            @com.google.gson.annotations.SerializedName("name")
            var name: String? = null
            @com.google.gson.annotations.SerializedName("href")
            var href: String? = null
            @com.google.gson.annotations.SerializedName("templated")
            var isTemplated: Boolean = false
        }
    }
}