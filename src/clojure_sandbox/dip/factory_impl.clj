(ns sandbox.dip.factory-impl
  (:require [sandbox.dip.factory :as f])
  ;; apparently import uses the '_' - perhaps because that's what the filename actually is??
  (:import [sandbox.dip.interface_impl InterfaceImpl]))

(deftype FactoryImpl []
  f/Factory
  (create-interface [_this] (InterfaceImpl.)))

#_(defn create-factory []
  (FactoryImpl.))

(comment

  (let [f (FactoryImpl.)]
    (f/create-interface f)))
