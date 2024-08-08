

trcli -y -c "trcli-config.yml" --suite-id 388 parse_junit -f "./target/vindrivesTestRun.xml"

## Accronym
Used Inventory : UI
New Inventory : NI

Demo Client : DC

## To Create and upload testrail result
Step 1 Run script
Step 2 Run Maven verify
Step 3 Run trcli -y -h https://revdojo.testrail.io --project "Revdojo" --username "joshua@revdojo.com" --password "Jjuanillo1396@" parse_junit --title "Automation VIN-DC UI Result Summary" --suite-id 388 -f "./target/vindrivesTestRun.xml"