(ns nth-fibo.ui
  (:gen-class))
(use 'seesaw.core)
; using the native Look and Feel
(native!)
; the main frame for the application
(def app-frame (frame :title "nth Fibo" 
	:on-close :exit
	:width 300 
	:height 85
	:resizable? false))
; label for input
(def in-lbl (label :text"Enter N"))
; Go! button
(def go-btn (button :text "Go!"))
; text-field to read N
(def in-txt (text))
; text-field to print output
(def out-txt (text))

; action listener for button
(listen go-btn :action (fn [e]
	(let [N (text in-txt)]
		(loop [a 0 b 1 n (Integer. N)] ; calculating fibonacci number
			(if (> n 0)
				(recur b (+' a b) (dec n))
			(config! out-txt :text (str a))))))) ; updating to the UI

; put all components in the frame
(config! app-frame :content 
	(border-panel
		:west in-lbl
		:center in-txt
		:east go-btn
		:south out-txt
		:vgap 5 :hgap 5 :border 5))


; pack and display the frame
(defn display-ui
	"Displays the UI"
 	[]
	(-> app-frame show!))
	;(config! app-frame :size 700))