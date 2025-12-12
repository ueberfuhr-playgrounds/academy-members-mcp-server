# Academy Members MCP Server

A Spring Boot-based Model Context Protocol (MCP) server that provides information about academy members.

> [!NOTE]
> This is a sample project for demonstration purposes based on [this article](https://medium.com/@saphynogenov/mcp-server-with-spring-ai-d38639e6391a).

## Overview

This project demonstrates how to build an MCP server using Spring AI's MCP Server capabilities. When integrated with an LLM (Large Language Model), it enables querying academy member information through natural language commands.

## Features

- **MCP Server Implementation**: Built with Spring AI 1.1.2 and Spring Boot 3.5.8
- **Academy Member Queries**: Retrieve information about academy members via LLM integration
- **Example Usage**: Write `/academy-member Ray` in your LLM client to get a description about Ray

## Technology Stack

- Java 21
- Spring Boot 3.5.8
- Spring AI 1.1.2 (spring-ai-starter-mcp-server)
- Lombok
- Maven

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+

### Running the Server

```bash
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvnw.cmd spring-boot:run
```

## Integration with LLM

Once the MCP server is running, you can connect it to your LLM client. The server exposes academy member data that can be queried through natural language:

**Example Query:**

```bash
/academy-member Ray
```

This will return information about the academy member named Ray.
