(ns planck-macros-test.common)

(defmacro add-regular [& args]
  `(+ ~@args))

#?(:clj (defmacro add-clj [& args]
          `(+ ~@args)))