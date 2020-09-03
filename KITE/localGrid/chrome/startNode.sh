echo -n -e "\033]0;NODE CHROME\007"
#java -Dwebdriver.chrome.driver=./chromedriver -jar ../selenium.jar -role node -maxSession 5 -port 6001 -host localhost -hub http://localhost:4444/grid/register -browser browserName=chrome,version=83,platform=LINUX,maxInstances=5 --debug

java -Dwebdriver.chrome.driver=./chromedriver -jar ../selenium.jar -role node -maxSession 5 -port 6001 -host localhost -hub http://localhost:4444/grid/register -browser browserName=chrome,version="73.0.3683.68",platform=LINUX,chrome_binary="/opt/electron-quick-start/ers-app/electron-quick-start-linux-x64/electron-quick-start",maxInstances=5 --debug
