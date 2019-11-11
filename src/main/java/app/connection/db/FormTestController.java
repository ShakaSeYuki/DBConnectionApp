package app.connection.db;

import java.util.Collections;
import java.util.Map;
//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.connection.db.FormTestController;

@RestController
@RequestMapping("api")
public class FormTestController {
	private static final Logger log = LoggerFactory.getLogger( FormTestController.class );

	@RequestMapping("/test/{param}")
    private String testPathVariable( @PathVariable String param ) {
        log.info( param );
        return "受け取ったパラメータ：" + param;
    }

    @RequestMapping("/test")
    private String testRequestParam( @RequestParam() String param ) {
        log.info( param );
        return "受け取ったパラメータ：" + param;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    private String testRequestBody( @RequestBody String body ) {
        log.info( body );
        return "受け取ったリクエストボディ：" + body;
    }
    
    /** 登録：CRUDでいう <b>C:CREATE</b> を行うAPI */
    /** curl http://localhost:8080/api/resource/xxx -XPOST 'name=aaa' */
    //@RequestMapping(value="/resource", method=RequestMethod.POST)
    @RequestMapping(value="/resource/{id}", method=RequestMethod.POST)
    @ResponseBody
    //public Map<String, String> create(@RequestBody String data) {
    public Map<String, String> create(@PathVariable String id) {
        //return "登録だよ";
    	return Collections.singletonMap("message", "登録だよ");
    }
    
    /** 参照：CRUDでいう <b>R:READ</b> を行うAPI */
    /** curl http://localhost:8080/api/resource/xxx */
    @RequestMapping(value="/resource/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, String> read(@PathVariable String id) {
        //return "参照だよ";
    	return Collections.singletonMap("message", "参照だよ");
    }
    
    /** 削除：CRUDでいう <b>D:DELETE</b> を行うAPI */
    /** curl http://localhost:8080/api/resource/xxx -XDELETE 'name=aaa' */
    @RequestMapping(value="/resource/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public Map<String, String> delete(@PathVariable String id) {
        //return "削除だよ";
    	return Collections.singletonMap("message", "削除だよ");
    }

    /** 更新：CRUDでいう <b>U:UPDATE</b> を行うAPI */
    /** curl http://localhost:8080/api/resource/xxx -XPUT 'name=aaa' */
    // ※PUTを使うのかPATCHを使うのかと言うのはまた別な話として、、、
    @RequestMapping(value="/resource/{id}", method=RequestMethod.PUT)
    @ResponseBody
    //public Map<String, String> update(@PathVariable String id, @RequestBody String data) {
    public Map<String, String> update(@PathVariable String id) {
        //return "更新だよ";
    	return Collections.singletonMap("message", "更新だよ");
    }
    
    /** json形式のデータ受信・json形式で送信 */
    @RequestMapping(value="/resource", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    @ResponseBody
    public FormTest json(@RequestBody FormTest data) {
    	System.out.println(data.getMethod());
    	System.out.println(data.getMsg());
    	System.out.println(data.getMemo());
    	return data;
    }
    
    /** GETパラメータからJSON形式で送信 */
    @RequestMapping(value="/resource", method= {RequestMethod.GET})
    @ResponseBody
    public FormTest create(
    		@RequestParam("method") String method,
    		@RequestParam("msg") String msg,
    		@RequestParam("memo") String memo
    		) {
    	System.out.println(method);
    	System.out.println(msg);
    	System.out.println(memo);
    	return new FormTest(method, msg, memo);
    }
}