(defproject aquarium "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.github.sarxos/webcam-capture "0.3.12"]]
  :main gui.app
  :aot [gui.app]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
