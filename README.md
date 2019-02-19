# init

Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\nile\vscode_git\webservcies> git add .
warning: LF will be replaced by CRLF in build.gradle.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in src/main/java/com/jojoldu/webservcies/Application.java.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in bin/main/application.yml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in src/main/resources/application.yml.
The file will have its original line endings in your working directory
PS C:\Users\nile\vscode_git\webservcies> git branch tutorial1-2
PS C:\Users\nile\vscode_git\webservcies> git checkout tutorial1-2
Switched to branch 'tutorial1-2'
D       bin/main/application.properties
M       bin/main/com/jojoldu/webservcies/Application.class
M       bin/main/com/jojoldu/webservcies/web/WebRestController.class
M       build.gradle
M       src/main/java/com/jojoldu/webservcies/Application.java
M       src/main/java/com/jojoldu/webservcies/web/WebRestController.java
D       src/main/resources/application.properties
PS C:\Users\nile\vscode_git\webservcies> git add .
warning: LF will be replaced by CRLF in build.gradle.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in src/main/java/com/jojoldu/webservcies/Application.java.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in bin/main/application.yml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in src/main/resources/application.yml.
The file will have its original line endings in your working directory
PS C:\Users\nile\vscode_git\webservcies> git commit -m "tutorial 1-2"
[tutorial1-2 130c60e] tutorial 1-2
 21 files changed, 403 insertions(+), 3 deletions(-)
 create mode 100644 .vscode/settings.json
 delete mode 100644 bin/main/application.properties
 create mode 100644 bin/main/application.yml
 create mode 100644 bin/main/com/jojoldu/webservcies/domain/BaseTimeEntity.class
 create mode 100644 bin/main/com/jojoldu/webservcies/domain/posts/Posts$PostsBuilder.class
 create mode 100644 bin/main/com/jojoldu/webservcies/domain/posts/Posts.class
 create mode 100644 bin/main/com/jojoldu/webservcies/domain/posts/PostsRepository.class
 create mode 100644 bin/main/com/jojoldu/webservcies/dto/posts/PostsSaveRequestDto.class
 rewrite bin/main/com/jojoldu/webservcies/web/WebRestController.class (89%)
 create mode 100644 bin/test/com/jojoldu/webservcies/domain/PostsRepositoryTest.class
 create mode 100644 src/main/java/com/jojoldu/webservcies/domain/BaseTimeEntity.java
 create mode 100644 src/main/java/com/jojoldu/webservcies/domain/posts/Posts.java
 create mode 100644 src/main/java/com/jojoldu/webservcies/domain/posts/PostsRepository.java
 create mode 100644 src/main/java/com/jojoldu/webservcies/dto/posts/PostsSaveRequestDto.java
 delete mode 100644 src/main/resources/application.properties
 create mode 100644 src/main/resources/application.yml
 create mode 100644 src/test/java/com/jojoldu/webservcies/domain/PostsRepositoryTest.java
PS C:\Users\nile\vscode_git\webservcies> git push -u origin tutorial1-2
Enumerating objects: 79, done.
Counting objects: 100% (79/79), done.
Delta compression using up to 4 threads
Compressing objects: 100% (39/39), done.
Writing objects: 100% (54/54), 15.19 KiB | 598.00 KiB/s, done.
Total 54 (delta 4), reused 0 (delta 0)
remote: Resolving deltas: 100% (4/4), completed with 4 local objects.
remote:
remote: Create a pull request for 'tutorial1-2' on GitHub by visiting:
remote:      https://github.com/newtein80/webservices/pull/new/tutorial1-2
remote:
To https://github.com/newtein80/webservices.git
 * [new branch]      tutorial1-2 -> tutorial1-2
Branch 'tutorial1-2' set up to track remote branch 'tutorial1-2' from 'origin'.
PS C:\Users\nile\vscode_git\webservcies>