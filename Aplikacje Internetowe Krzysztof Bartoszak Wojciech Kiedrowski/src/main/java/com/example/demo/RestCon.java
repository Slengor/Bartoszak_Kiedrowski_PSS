package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestCon
{
    private final UsersRepository r1;
    private final RoleRepository r2;
    private final DelegationRepository d3;
    
    public RestCon(UsersRepository r1, RoleRepository r2,DelegationRepository d3)
    {
        this.r1 = r1;
        this.r2 = r2;
        this.d3 = d3;
    }
    
    public RestCon() 
    {
		this.r1 = null;
		this.r2 = null;
		this.d3 = null;
    }
    @GetMapping("/niezalogowany")
    public String nie() {
    	return "wystapil blad";
    }
    @GetMapping("/zalogowany")
    public String tak() {
    	return "zalogowanyy";
    }

    @PostMapping("/U")
    void registerUser(@RequestBody Users u){
        r1.save(u);
    }
    @GetMapping("/U")
    List<Users> getAllUsers(){
      return r1.findAll();
    }
    @PutMapping("/U/{id}")
    void changePassword(@PathVariable int id, String newPassword){
        r1.findById(id).map(u ->{u.setPassword(newPassword);
                                        return r1.save(u);});
    }
    @DeleteMapping("/U/{id}")
    boolean deleteUserById(@PathVariable int id){
        if(r1.findById(id)!=null) {
            r1.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
    @PostMapping("/Del")
    void addDelegation(@PathVariable int userId, @PathVariable int delegationId){
        Delegation d;
        r1.findById(userId).map(u ->{u.addDelegation(d3.findById(delegationId));
            return r1.save(u);});
    }
    @DeleteMapping
    boolean removeDelegation(long userId, long delegationId){
        return true;
    }
    @PutMapping
    void changeDelegation(long delegationId, Delegation delegation){

    }
    @GetMapping("/AllDel")
    List<Delegation> getAllDelegations(){
        return d3.findAll();
    }
    @GetMapping("/Del")
    List<Delegation>getAllDelegationsOrderByDateStartDesc()
    {
        return d3.findAll();
    }
    @GetMapping
    List<Delegation> getAllDelegationsByUserOrderByDateStartDesc()
    {
        return d3.findAll();
    }
    @GetMapping("/U/{role}")
    List<Users> getAllUsersByRoleName(@PathVariable String RoleName)
    {
        return r1.findAll();
    }

}