(defproject ring/ring-anti-forgery "1.0.1"
  :description "Ring middleware to prevent CSRF attacks"
  :url "https://github.com/ring-clojure/ring-anti-forgery"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [crypto-random "1.2.0"]
                 [crypto-equality "1.0.0"]
                 [hiccup "1.0.5"]]
  :aliases {"test-all" ["with-profile" "default:+1.4:+1.5:+1.6:+1.7:+1.8" "test"]}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}
   :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
   :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
   :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}})
