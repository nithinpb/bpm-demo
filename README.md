# How to run
## Setup
- Install Eclipse or Intellij Idea IDEs
- Or install maven and spring-cli - https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html

## Run
- `mvn clean install` command to install dependencies
- `mvn spring-boot:run` command to run the project

# Processes
- Added 2 process files at `/src/main/resources/processes`
- ProcessLoader is the initializer code
- Only one is loaded (basic)

# Flowable 
- I have added one dependency in POM for `flowable-spring-boot-starter-rest-api`
- Other ones are available here - https://github.com/flowable/flowable-engine/tree/master/modules/flowable-spring-boot

# REST
Because REST is enabled, you can visit the following URLs. username/password in ProcessLoader file. 

* /form/form-data],methods=[GET],produces=[application/json]}"
* /form/form-data],methods=[POST],produces=[application/json]}"
* /history/historic-activity-instances],methods=[GET],produces=[application/json]}"
* /query/historic-activity-instances],methods=[POST],produces=[application/json]}"
* /history/historic-detail],methods=[GET],produces=[application/json]}"
* /history/historic-detail/{detailId}/data],methods=[GET]}"
* /query/historic-detail],methods=[POST],produces=[application/json]}"
* /history/historic-process-instances],methods=[GET],produces=[application/json]}"
* /history/historic-process-instances/{processInstanceId}/comments],methods=[GET],produces=[application/json]}"
* /history/historic-process-instances/{processInstanceId}/comments],methods=[POST],produces=[application/json]}"
* /history/historic-process-instances/{processInstanceId}/comments/{commentId}],methods=[DELETE]}"
* /history/historic-process-instances/{processInstanceId}/comments/{commentId}],methods=[GET],produces=[application/json]}"
* /history/historic-process-instances/{processInstanceId}/identitylinks],methods=[GET],produces=[application/json]}"
* /query/historic-process-instances],methods=[POST],produces=[application/json]}"
* /history/historic-process-instances/{processInstanceId}],methods=[GET],produces=[application/json]}"
* /history/historic-process-instances/{processInstanceId}],methods=[DELETE]}"
* /history/historic-process-instances/{processInstanceId}/variables/{variableName}/data],methods=[GET]}"
* /history/historic-task-instances],methods=[GET],produces=[application/json]}"
* /history/historic-task-instances/{taskId}/identitylinks],methods=[GET],produces=[application/json]}"
* /query/historic-task-instances],methods=[POST],produces=[application/json]}"
* /history/historic-task-instances/{taskId}],methods=[GET],produces=[application/json]}"
* /history/historic-task-instances/{taskId}],methods=[DELETE]}"
* /history/historic-task-instances/{taskId}/variables/{variableName}/data],methods=[GET]}"
* /history/historic-variable-instances],methods=[GET],produces=[application/json]}"
* /history/historic-variable-instances/{varInstanceId}/data],methods=[GET]}"
* /query/historic-variable-instances],methods=[POST],produces=[application/json]}"
* /identity/groups],methods=[GET],produces=[application/json]}"
* /identity/groups],methods=[POST],produces=[application/json]}"
* /identity/groups/{groupId}/members],methods=[POST],produces=[application/json]}"
* /identity/groups/{groupId}/members/{userId}],methods=[DELETE]}"
* /identity/groups/{groupId}],methods=[PUT],produces=[application/json]}"
* /identity/groups/{groupId}],methods=[DELETE]}"
* /identity/groups/{groupId}],methods=[GET],produces=[application/json]}"
* /identity/users],methods=[GET],produces=[application/json]}"
* /identity/users],methods=[POST],produces=[application/json]}"
* /identity/users/{userId}/info],methods=[GET],produces=[application/json]}"
* /identity/users/{userId}/info],methods=[POST],produces=[application/json]}"
* /identity/users/{userId}/info/{key}],methods=[GET],produces=[application/json]}"
* /identity/users/{userId}/info/{key}],methods=[PUT],produces=[application/json]}"
* /identity/users/{userId}/info/{key}],methods=[DELETE]}"
* /identity/users/{userId}/picture],methods=[GET]}"
* /identity/users/{userId}/picture],methods=[PUT]}"
* /identity/users/{userId}],methods=[GET],produces=[application/json]}"
* /identity/users/{userId}],methods=[PUT],produces=[application/json]}"
* /identity/users/{userId}],methods=[DELETE]}"
* /management/deadletter-jobs],methods=[GET],produces=[application/json]}"
* /management/jobs],methods=[GET],produces=[application/json]}"
* /management/timer-jobs/{jobId}/exception-stacktrace],methods=[GET]}"
* /management/jobs/{jobId}/exception-stacktrace],methods=[GET]}"
* /management/suspended-jobs/{jobId}/exception-stacktrace],methods=[GET]}"
* /management/deadletter-jobs/{jobId}/exception-stacktrace],methods=[GET]}"
* /management/jobs/{jobId}],methods=[GET],produces=[application/json]}"
* /management/timer-jobs/{jobId}],methods=[GET],produces=[application/json]}"
* /management/suspended-jobs/{jobId}],methods=[GET],produces=[application/json]}"
* /management/deadletter-jobs/{jobId}],methods=[GET],produces=[application/json]}"
* /management/jobs/{jobId}],methods=[DELETE]}"
* /management/timer-jobs/{jobId}],methods=[DELETE]}"
* /management/suspended-jobs/{jobId}],methods=[DELETE]}"
* /management/deadletter-jobs/{jobId}],methods=[DELETE]}"
* /management/jobs/{jobId}],methods=[POST]}"
* /management/timer-jobs/{jobId}],methods=[POST]}"
* /management/deadletter-jobs/{jobId}],methods=[POST]}"
* /management/engine],methods=[GET],produces=[application/json]}"
* /management/properties],methods=[GET],produces=[application/json]}"
* /management/suspended-jobs],methods=[GET],produces=[application/json]}"
* /management/tables],methods=[GET],produces=[application/json]}"
* /management/tables/{tableName}/columns],methods=[GET],produces=[application/json]}"
* /management/tables/{tableName}/data],methods=[GET],produces=[application/json]}"
* /management/tables/{tableName}],methods=[GET],produces=[application/json]}"
* /management/timer-jobs],methods=[GET],produces=[application/json]}"
* /repository/deployments],methods=[GET],produces=[application/json]}"
* /repository/deployments],methods=[POST],consumes=[multipart/form-data],produces=[application/json]}"
* /repository/deployments/{deploymentId}],methods=[GET],produces=[application/json]}"
* /repository/deployments/{deploymentId}],methods=[DELETE],produces=[application/json]}"
* /repository/deployments/{deploymentId}/resources],methods=[GET],produces=[application/json]}"
* /repository/deployments/{deploymentId}/resourcedata/{resourceName}],methods=[GET]}"
* /repository/deployments/{deploymentId}/resources/**],methods=[GET],produces=[application/json]}"
* /repository/models],methods=[GET],produces=[application/json]}"
* /repository/models],methods=[POST],produces=[application/json]}"
* /repository/models/{modelId}],methods=[PUT],produces=[application/json]}"
* /repository/models/{modelId}],methods=[DELETE]}"
* /repository/models/{modelId}],methods=[GET],produces=[application/json]}"
* /repository/models/{modelId}/source-extra],methods=[GET]}"
* /repository/models/{modelId}/source-extra],methods=[PUT]}"
* /repository/models/{modelId}/source],methods=[GET]}"
* /repository/models/{modelId}/source],methods=[PUT]}"
* /repository/process-definitions],methods=[GET],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}/decision-tables],methods=[GET],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}/form-definitions],methods=[GET],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}/identitylinks],methods=[POST],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}/identitylinks],methods=[GET],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}],methods=[GET],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}],methods=[DELETE]}"
* /repository/process-definitions/{processDefinitionId}/image],methods=[GET]}"
* /repository/process-definitions/{processDefinitionId}/model],methods=[GET],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}],methods=[GET],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}],methods=[PUT],produces=[application/json]}"
* /repository/process-definitions/{processDefinitionId}/resourcedata],methods=[GET]}"
* /runtime/event-subscriptions],methods=[GET],produces=[application/json]}"
* /runtime/event-subscriptions/{eventSubscriptionId}],methods=[GET],produces=[application/json]}"
* /runtime/executions/{executionId}/activities],methods=[GET],produces=[application/json]}"
* /runtime/executions],methods=[GET],produces=[application/json]}"
* /runtime/executions],methods=[PUT]}"
* /query/executions],methods=[POST],produces=[application/json]}"
* /runtime/executions/{executionId}],methods=[GET],produces=[application/json]}"
* /runtime/executions/{executionId}],methods=[PUT],produces=[application/json]}"
* /runtime/executions/{executionId}/variables],methods=[GET],produces=[application/json]}"
* /runtime/executions/{executionId}/variables],methods=[POST],produces=[application/json]}"
* /runtime/executions/{executionId}/variables],methods=[PUT],produces=[application/json]}"
* /runtime/executions/{executionId}/variables],methods=[DELETE]}"
* /runtime/executions/{executionId}/variables/{variableName}/data],methods=[GET]}"
* /runtime/executions/{executionId}/variables/{variableName}],methods=[GET],produces=[application/json]}"
* /runtime/executions/{executionId}/variables/{variableName}],methods=[PUT],produces=[application/json]}"
* /runtime/executions/{executionId}/variables/{variableName}],methods=[DELETE]}"
* /runtime/process-instances],methods=[GET],produces=[application/json]}"
* /runtime/process-instances],methods=[POST],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/diagram],methods=[GET]}"
* /runtime/process-instances/{processInstanceId}/identitylinks],methods=[POST],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/identitylinks],methods=[GET],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/identitylinks/users/{identityId}/{type}],methods=[GET],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/identitylinks/users/{identityId}/{type}],methods=[DELETE]}"
* /query/process-instances],methods=[POST],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}],methods=[GET],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}],methods=[DELETE]}"
* /runtime/process-instances/{processInstanceId}],methods=[PUT],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/change-state],methods=[POST],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/variables],methods=[GET],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/variables],methods=[POST],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/variables],methods=[PUT],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/variables],methods=[DELETE]}"
* /runtime/process-instances/{processInstanceId}/variables/{variableName}/data],methods=[GET]}"
* /runtime/process-instances/{processInstanceId}/variables/{variableName}],methods=[GET],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/variables/{variableName}],methods=[PUT],produces=[application/json]}"
* /runtime/process-instances/{processInstanceId}/variables/{variableName}],methods=[DELETE]}"
* /runtime/signals],methods=[POST]}"
* /runtime/tasks/{taskId}/attachments],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/attachments],methods=[POST],produces=[application/json]}"
* /runtime/tasks/{taskId}/attachments/{attachmentId}/content],methods=[GET]}"
* /runtime/tasks/{taskId}/attachments/{attachmentId}],methods=[DELETE]}"
* /runtime/tasks/{taskId}/attachments/{attachmentId}],methods=[GET],produces=[application/json]}"
* /runtime/tasks],methods=[GET],produces=[application/json]}"
* /runtime/tasks],methods=[POST],produces=[application/json]}"
* /runtime/tasks/{taskId}/comments],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/comments],methods=[POST],produces=[application/json]}"
* /runtime/tasks/{taskId}/comments/{commentId}],methods=[DELETE]}"
* /runtime/tasks/{taskId}/comments/{commentId}],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/events],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/events/{eventId}],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/events/{eventId}],methods=[DELETE]}"
* /runtime/tasks/{taskId}/identitylinks],methods=[POST],produces=[application/json]}"
* /runtime/tasks/{taskId}/identitylinks],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/identitylinks/{family}],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}],methods=[DELETE]}"
* /query/tasks],methods=[POST],produces=[application/json]}"
* /runtime/tasks/{taskId}],methods=[PUT],produces=[application/json]}"
* /runtime/tasks/{taskId}],methods=[POST]}"
* /runtime/tasks/{taskId}],methods=[DELETE]}"
* /runtime/tasks/{taskId}],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/subtasks],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/variables],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/variables],methods=[POST],produces=[application/json]}"
* /runtime/tasks/{taskId}/variables],methods=[DELETE]}"
* /runtime/tasks/{taskId}/variables/{variableName}/data],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/variables/{variableName}],methods=[GET],produces=[application/json]}"
* /runtime/tasks/{taskId}/variables/{variableName}],methods=[PUT],produces=[application/json]}"
* /runtime/tasks/{taskId}/variables/{variableName}],methods=[DELETE]}"
 