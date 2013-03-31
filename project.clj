(defproject net.likestream/clj-facebook-graph "0.5.0-SNAPSHOT"

  :description "A Clojure client for the Facebook Graph API"

  :url "http://github.com/LikeStream/clj-facebook-graph/"

  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.0.2"]
                 [ring/ring-core "1.1.8"]
                 [clj-http "0.7.0"]
                 [slingshot "0.10.3"]
                 [bwhmather/clj-oauth2 "0.5.1"]
                 ]

  :profiles {:dev {:dependencies [[ring/ring-devel "1.1.8"]
                                  [ring/ring-jetty-adapter "1.1.8"]
                                  [compojure "1.1.5"]]}}
)
