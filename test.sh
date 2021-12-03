echo "Get projects"
curl http://localhost:8080/project

echo "\n"

echo "Post project"
curl -X POST \
	-H "Content-Type: application/json" \
	-H "Accept: application/json" \
	-d @./data/postProject.json \
	http://localhost:8080/project

echo "\n"

echo "Reject project"
curl -X POST \
	-H "Content-Type: application/json" \
	-H "Accept: application/json" \
	-d @./data/postProject.json \
	http://localhost:8080/project

echo "\n"

echo "Get tasks"
curl http://localhost:8080/task

echo "\n"

echo "Post tasks"
curl -X POST \
	-H "Content-Type: application/json" \
	-H "Accept: application/json" \
	-d @./data/postTask.json \
	http://localhost:8080/task

