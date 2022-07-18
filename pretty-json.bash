cd "$(dirname "$0")"

pbpaste | java -jar ./target/pretty-json-1.0-jar-with-dependencies.jar | pbcopy

pbpaste