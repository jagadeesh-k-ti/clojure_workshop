(ns clojure-workshop.core
  (:gen-class))

;; required to call case ops
(require 'clojure.string)

(defn square [x] (* x x))

(defn greet [name] (str "Hello " name "!"))

(defn myfunc [x]
  (loop [y x]
    (when (> y 0)
      (println y)
      (recur (- y 2))
      ))
  )

(defn moodrepeater [msg mood] (if (= mood 1) 
                                (println 
                                 (clojure.string/capitalize msg) 
                                 ) (if (= mood 2) 
                                     (println (clojure.string/upper-case msg))
                                       (println "unknown mood!"))
                                )
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (square 6))
  (println (greet "jagadeesh"))
  (myfunc 10)
  (moodrepeater "hello" 1)
  (moodrepeater "hello" 2)
  )
