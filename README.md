# STARTUP GUIDE

## Defined data base

| Item | value |
| ------ | ----------- |
| repository   | mysql |
| port | 8094 |
| database name    | cardif |

docker run image:
```
docker run --detach --name=test-mysql -p 8094:3306  --env="MYSQL_ROOT_PASSWORD=abcd1234" mysql
```

## Project Url

| Item | value |
| ------ | ----------- |
| project contextPath   | cardif |
| port | 8000 |

example of consuming a service
```
http://localhost:8000/cardif/employee
```

