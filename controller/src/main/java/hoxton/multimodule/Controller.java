package hoxton.multimodule;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final MemberService memberService;

    @GetMapping("/greeting")
    public String greeting(){
        return  "Hello";
    }


    @PostMapping("/")
    public ResponseEntity<Member> addMember(@RequestBody Member member){
        memberService.addMember(member);
        return ResponseEntity.status(HttpStatus.OK).body(member);
    }

    @GetMapping("/")
    public ResponseEntity<List<Member>> getAllMember(){
        List<Member> allMember = memberService.getAllMember();
        return ResponseEntity.status(HttpStatus.OK).body(allMember);
    }
}