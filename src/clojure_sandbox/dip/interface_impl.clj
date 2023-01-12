(ns sandbox.dip.interface-impl
  (:require [sandbox.dip.interface :refer [Interface] :as i]))

(deftype InterfaceImpl []
  Interface
  (foo [_this x] (str "From InterfaceImpl: " (pr-str x))))
