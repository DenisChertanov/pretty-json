# pretty-json

## Overview
It's just a simple tool for making your raw JSON string pretty
1. Copy raw JSON to clipboard
2. Execute ***pretty-json*** command in terminal
3. Pretty json will be printed in terminal and copied to clipboard

## Installation:
1. Clone repository:
```bash
git clone git@github.com:DenisChertanov/pretty-json.git
```
2. Build project:
```bash
cd ${your_working_directory}
mvn clean install
```

## Execution:
```bash
bash ${your_working_directory}/pretty-json.bash
```

## Make alias:
Open your ~/.bashrc or ~/.zshrc file and paste following:
```bash
alias pretty-json="bash ${your_working_directory}/pretty-json.bash"
```
After recreating terminal you will be able to execute prettifier by ***pretty-json*** command
