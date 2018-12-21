(defproject liberator-examples "0.15.2"
  :description "Liberator Examples"
  :url "http://clojure-liberator.github.io/liberator"
  :dependencies [[compojure "1.5.2"]
                 [liberator "0.15.2"]
                 [org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.439"]
                 [ring/ring-jetty-adapter "1.5.1"]]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :scm {:connection "scm:git:https://github.com/clojure-liberator/liberator-examples.git"
        :url "https://github.com/clojure-liberator/liberator"}
  :plugins [[lein-midje "3.2.1"]
            [lein-ring "0.10.0"]]
  :profiles {:dev {:dependencies [[ring-mock "0.1.5" :exclusions [ring/ring-codec]]
                                  [ring/ring-devel "1.5.1"]
                                  [midje "1.9.4"]]}}
  :ring {:handler liberator.examples.server/handler
         :adapter {:port 8000}}
  :aliases {"examples" ["run" "-m" "liberator.examples.server"]})

