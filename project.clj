(defproject nth-fibo "0.1.0-SNAPSHOT"
  :description "A Clojure app to calculate nth Fibonacci number"
  :url "https://github.com/RK-Singh/nth-fibo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
  				 [seesaw "1.4.5"]]
  :main nth-fibo.core
  :aot [nth-fibo.core nth-fibo.ui]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
