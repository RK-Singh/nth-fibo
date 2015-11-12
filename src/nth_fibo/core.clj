(ns nth-fibo.core
  (:gen-class))
(use 'nth-fibo.ui)

(defn -main
  "Application entry point"
  [& args]
  (display-ui))
