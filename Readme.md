

trcli -y -c "trcli-config.yml" --suite-id 388 parse_junit -f "./target/vindrivesTestRun.xml"

## Accronym
Used Inventory : UI
New Inventory : NI

Demo Client : DC

## To Create and upload testrail result
Step 1 Run script
Step 2 Run Maven verify
Step 3 Run trcli -y -h https://revdojo.testrail.io --project "Revdojo" --username "joshua@revdojo.com" --password "Jjuanillo1396@" parse_junit --title "Automation VIN-DC UI" --run-id 557 --case-matcher "name" -f "./target/vindrivesTestRun.xml"

With Test Plan
trcli -y -h https://revdojo.testrail.io --project "Revdojo" --username "joshua@revdojo.com" --password "Jjuanillo1396@" parse_junit --title "Demo Client" --plan-id 576 --run-id 577 --case-matcher "name" -f "./target/vindrivesTestRun.xml"