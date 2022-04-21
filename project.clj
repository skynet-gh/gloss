(defproject org.clj-commons/gloss "0.3.0"
  :description "Speaks in bytes, so that you don't have to"
  
  :url "https://github.com/clj-commons/gloss"
  :scm {:name "git" :url "https://github.com/clj-commons/gloss"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}

  :dependencies [[manifold/manifold "0.2.3"]
                 [org.clj-commons/byte-streams "0.3.0"]
                 [potemkin/potemkin "0.4.5"]]

  :profiles {:dev {:dependencies [[org.clojure/clojure "1.11.1"]]}
             :ci {:javac-options ["-target" "1.8" "-source" "1.8"]
                  :dependencies [[org.clojure/clojure "1.11.1"]]}}
  :cljfmt {:indents {#".*" [[:inner 0]]}}

  :plugins [[jonase/eastwood "1.2.3"]]
  :eastwood {:exclude-linters [:non-dynamic-earmuffs :unlimited-use :unused-meta-on-macro]}

  :global-vars {*warn-on-reflection* true}
  :javac-options ["-target" "1.8" "-source" "1.8"])
