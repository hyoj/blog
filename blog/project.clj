(defproject cryogen "0.1.0"
       :description "Simple static site generator"
       :url "https://github.com/lacarmen/cryogen"
       :license {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
       :dependencies [[org.clojure/clojure "1.10.0"]
                      [ring/ring-devel "1.7.1"]
                      [compojure "1.6.1"]
                      [ring-server "0.5.0"]
                      [cryogen-asciidoc "0.1.4"]
                      
                      ;;
                      [camel-snake-kebab "0.4.0"]
                      [cheshire "5.8.1"]
                      [clj-rss "0.2.5"]
                      [clj-text-decoration "0.0.3"]
                      [enlive "1.1.6"]
                      [hawk "0.2.11"]
                      [hiccup "1.0.5"]
                      [io.aviso/pretty "0.1.37"]
                      [me.raynes/fs "1.4.6"]
                      [pandect "0.6.1"]
                      [prismatic/schema "1.1.10"]
                      [selmer "1.12.12"]
                      [hickory "0.7.1"]
                      ]
       :source-paths ["src" "../cryogen-core/src"]
       :plugins [[lein-ring "0.12.5"]]
       :main cryogen.core
       :ring {:init cryogen.server/init
              :handler cryogen.server/handler})