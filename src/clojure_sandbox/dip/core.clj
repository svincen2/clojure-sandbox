(ns sandbox.dip.core
  (:require [sandbox.dip.interface :as i]
            [sandbox.dip.factory :as f])
  (:import [sandbox.dip.factory_impl FactoryImpl]))

(defn do-core-stuff [i]
  (i/foo i [1 2 3]))

(comment
  (let [;; The only "details/lower-level" dependency
        ;; This is typical of DIP, and would be the responsibility of -main (entrypoint)
        ;; Put the concrete impl stuff somewhere the rest of the code can get it, without knowing what the impl is.
        f (FactoryImpl.)]
    ;; now we are back to interfaces (protocols)
    ;; use the Factory protocol to create an Interface protocol implementor, without depending on the interface implemenation
    (do-core-stuff (f/create-interface f))))
