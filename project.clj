(defproject org.mobileink/migae.urlfetch "0.1.0-SNAPSHOT"
  :description "migae - Mobile Ink Google App Engine sdk for Clojure."
  :url "https://github.com/migae/urlfetch"
  :min-lein-version "2.0.0"
  :aot [#".*"]
  :omit-source true
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.9.17"]
                 [org.clojure/tools.logging "0.3.0"]]
  :repositories {"mvncentral" "mvnrepository.com"}
  :profiles {:dev {:dependencies
                   [[org.clojure/tools.logging "0.2.3"]]}})
