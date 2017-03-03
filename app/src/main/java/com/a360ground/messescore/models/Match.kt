package com.a360ground.messescore.models

/**
 * Created by Kiyos Solomon on 2/24/2017.
 */

class Match {


    /**
     * id : 47
     * date : 2017-02-24T18:24:21
     * date_gmt : 2017-02-24T18:24:21
     * guid : {"rendered":"http://localhost/KiyosScore/?post_type=sp_event&#038;p=47"}
     * modified : 2017-02-24T18:24:21
     * modified_gmt : 2017-02-24T18:24:21
     * slug : arsenal-vs-manchester-united
     * type : sp_event
     * link : http://localhost/KiyosScore/event/arsenal-vs-manchester-united/
     * title : {"rendered":"Arsenal vs Manchester United"}
     * content : {"rendered":"","protected":false}
     * excerpt : {"rendered":"","protected":false}
     * author : 1
     * featured_media : 0
     * template :
     * leagues : [2]
     * seasons : [3]
     * venues : [13]
     * teams : [7,9]
     * main_results : []
     * outcome : []
     * winner : null
     * minutes : 90
     * players : [0,12,0]
     * offense : []
     * defense : []
     * staff : [0,0]
     * results : {"7":[],"9":[],"0":[]}
     * performance : {"7":{"12":{"number":"17","position":0}},"0":{"position":"Position","goals":"Goals","assists":"Assists","yellowcards":"Yellow Cards","redcards":"Red Cards","owngoals":"Own Goals"}}
     * _links : {"self":[{"href":"http://localhost/KiyosScore/wp-json/sportspress/v2/sp_event/47"}],"collection":[{"href":"http://localhost/KiyosScore/wp-json/sportspress/v2/sp_event"}],"about":[{"href":"http://localhost/KiyosScore/wp-json/wp/v2/types/sp_event"}],"author":[{"embeddable":true,"href":"http://localhost/KiyosScore/wp-json/wp/v2/users/1"}],"wp:attachment":[{"href":"http://localhost/KiyosScore/wp-json/wp/v2/media?parent=47"}],"wp:term":[{"taxonomy":"sp_league","embeddable":true,"href":"http://localhost/KiyosScore/wp-json/wp/v2/leagues?post=47"},{"taxonomy":"sp_season","embeddable":true,"href":"http://localhost/KiyosScore/wp-json/wp/v2/seasons?post=47"},{"taxonomy":"sp_venue","embeddable":true,"href":"http://localhost/KiyosScore/wp-json/wp/v2/venues?post=47"}],"curies":[{"name":"wp","href":"https://api.w.org/{rel}","templated":true}]}
     */

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
    @com.google.gson.annotations.SerializedName("template")
    private val template: String? = null
    @com.google.gson.annotations.SerializedName("winner")
    private val winner: Any? = null
    @com.google.gson.annotations.SerializedName("minutes")
    private val minutes: Int = 0
    @com.google.gson.annotations.SerializedName("results")
    private val results: ResultsModel? = null
    @com.google.gson.annotations.SerializedName("performance")
    private val performance: PerformanceModel? = null
    @com.google.gson.annotations.SerializedName("_links")
    private val links: LinksModel? = null
    @com.google.gson.annotations.SerializedName("leagues")
    private val leagues: List<Int>? = null
    @com.google.gson.annotations.SerializedName("seasons")
    private val seasons: List<Int>? = null
    @com.google.gson.annotations.SerializedName("venues")
    private val venues: List<Int>? = null
    @com.google.gson.annotations.SerializedName("teams")
    private val teams: List<Int>? = null
    @com.google.gson.annotations.SerializedName("main_results")
    private val mainResults: List<*>? = null
    @com.google.gson.annotations.SerializedName("outcome")
    private val outcome: List<*>? = null
    @com.google.gson.annotations.SerializedName("players")
    private val players: List<Int>? = null
    @com.google.gson.annotations.SerializedName("offense")
    private val offense: List<*>? = null
    @com.google.gson.annotations.SerializedName("defense")
    private val defense: List<*>? = null
    @com.google.gson.annotations.SerializedName("staff")
    private val staff: List<Int>? = null

    class GuidModel {
        /**
         * rendered : http://localhost/KiyosScore/?post_type=sp_event&#038;p=47
         */

        @com.google.gson.annotations.SerializedName("rendered")
        var rendered: String? = null
    }

    class TitleModel {
        /**
         * rendered : Arsenal vs Manchester United
         */

        @com.google.gson.annotations.SerializedName("rendered")
        var rendered: String? = null
    }

    class ContentModel {
        /**
         * rendered :
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
         * protected : false
         */

        @com.google.gson.annotations.SerializedName("rendered")
        var rendered: String? = null
        @com.google.gson.annotations.SerializedName("protected")
        var isProtectedX: Boolean = false
    }

    class ResultsModel {
        @com.google.gson.annotations.SerializedName("7")
        var `$7`: List<*>? = null
        @com.google.gson.annotations.SerializedName("9")
        var `$9`: List<*>? = null
        @com.google.gson.annotations.SerializedName("0")
        var `$0`: List<*>? = null
    }

    class PerformanceModel {
        /**
         * 7 : {"12":{"number":"17","position":0}}
         * 0 : {"position":"Position","goals":"Goals","assists":"Assists","yellowcards":"Yellow Cards","redcards":"Red Cards","owngoals":"Own Goals"}
         */

        @com.google.gson.annotations.SerializedName("7")
        var `$7`: `_$7Model`? = null
        @com.google.gson.annotations.SerializedName("0")
        var `$0`: `_$0Model`? = null

        class `_$7Model` {
            /**
             * 12 : {"number":"17","position":0}
             */

            @com.google.gson.annotations.SerializedName("12")
            var `$12`: `_$12Model`? = null

            class `_$12Model` {
                /**
                 * number : 17
                 * position : 0
                 */

                @com.google.gson.annotations.SerializedName("number")
                var number: String? = null
                @com.google.gson.annotations.SerializedName("position")
                var position: Int = 0
            }
        }

        class `_$0Model` {
            /**
             * position : Position
             * goals : Goals
             * assists : Assists
             * yellowcards : Yellow Cards
             * redcards : Red Cards
             * owngoals : Own Goals
             */

            @com.google.gson.annotations.SerializedName("position")
            var position: String? = null
            @com.google.gson.annotations.SerializedName("goals")
            var goals: String? = null
            @com.google.gson.annotations.SerializedName("assists")
            var assists: String? = null
            @com.google.gson.annotations.SerializedName("yellowcards")
            var yellowcards: String? = null
            @com.google.gson.annotations.SerializedName("redcards")
            var redcards: String? = null
            @com.google.gson.annotations.SerializedName("owngoals")
            var owngoals: String? = null
        }
    }

    // FIXME generate failure  field _$WpTerm323
    // FIXME generate failure  field _$WpAttachment72
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
             * href : http://localhost/KiyosScore/wp-json/sportspress/v2/sp_event/47
             */

            @com.google.gson.annotations.SerializedName("href")
            var href: String? = null
        }

        class CollectionModel {
            /**
             * href : http://localhost/KiyosScore/wp-json/sportspress/v2/sp_event
             */

            @com.google.gson.annotations.SerializedName("href")
            var href: String? = null
        }

        class AboutModel {
            /**
             * href : http://localhost/KiyosScore/wp-json/wp/v2/types/sp_event
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

        class Wp {
            /**
             * href : http://localhost/KiyosScore/wp-json/wp/v2/media?parent=47
             */

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
