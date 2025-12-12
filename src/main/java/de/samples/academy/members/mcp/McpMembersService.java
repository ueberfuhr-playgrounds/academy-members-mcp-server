package de.samples.academy.members.mcp;

import de.samples.academy.members.domain.Member;
import de.samples.academy.members.domain.MembersService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class McpMembersService {

  private final MembersService membersService;

  @Tool(
    name = "get_academy_member_by_name",
    description = "Find information about a single Academy member."
  )
  public Optional<Member> getMember(String name) {
    return membersService.getMember(name);
  }

  @Tool(
    name = "get_academy_members",
    description = "Find information about all Academy members."
  )
  public Stream<Member> getAllMembers() {
    return membersService.getAllMembers();
  }
}
