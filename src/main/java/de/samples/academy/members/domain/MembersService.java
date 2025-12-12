package de.samples.academy.members.domain;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class MembersService {

  private final Collection<Member> members = List.of(
    new Member(
      "Ray",
      """
          The boss who somehow has a hand in everything—sometimes even in things he didn’t know existed.
          Demands excellence, perfection, and occasionally the impossible, preferably by yesterday.
        """
    ),
    new Member(
      "Christian",
      """
          The behind-the-scenes busy bee who quietly keeps the entire operation from collapsing.
          A master networker who knows everyone, everything, and probably where all the missing
          office supplies went.
        """
    ),
    new Member(
      "Ralf",
      """
          The detail-obsessed perfectionist who needs to understand every microscopic element before
           taking the next step—moving slower, but with the unstoppable determination of a tortoise
            armed with spreadsheets.
        """
    )
  );

  public Optional<Member> getMember(String name) {
    return members
      .stream()
      .filter(member -> member.name().equals(name))
      .findFirst();
  }

  public Stream<Member> getAllMembers() {
    return members
      .stream();
  }

}
