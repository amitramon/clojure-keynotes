(defproject clojure-keynotes "0.1.0-SNAPSHOT"
  :description "Presenting various Clojure key topics"
  :url "https://github.com/amitramon/clojure-keynotes"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot clojure-keynotes.core
  :plugins [[lein-jupyter "0.1.16"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
