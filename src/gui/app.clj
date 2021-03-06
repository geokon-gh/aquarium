(ns gui.app
  (:import  [com.github.sarxos.webcam Webcam]
            [javafx.embed.swing SwingFXUtils])
  (:gen-class
    :main true
    :extends javafx.application.Application))

(defn -start [app stage]
  (let [shot (.open (Webcam/getDefault))
        circ  (javafx.scene.image.ImageView. (SwingFXUtils/toFXImage  (.getImage (Webcam/getDefault)) nil));(javafx.scene.shape.Circle. 40 40 40)
        root (javafx.scene.Group.)                  ; Cannot use variadic arg constructor.
        scene (javafx.scene.Scene. root 400 300)]
    (.. root (getChildren) (add circ))              ; Add circle to group.
    (doto stage
      (.setTitle "My JavaFX Application")
      (.setScene scene)
      (.show))))

(defn -main [& args]
  (javafx.application.Application/launch gui.app (into-array String args)))
