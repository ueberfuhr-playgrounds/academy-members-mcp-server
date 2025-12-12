package de.samples.academy.members.mcp;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ToolsConfig {

  @Bean
  public List<ToolCallback> mcpMembersServiceTools(McpMembersService mcpMembersService) {
    return List.of(
      ToolCallbacks.from(mcpMembersService)
    );
  }

}
