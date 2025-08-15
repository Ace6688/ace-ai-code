package com.ace.aicode.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.ace.aicode.model.entity.ChatHistory;
import com.ace.aicode.mapper.ChatHistoryMapper;
import com.ace.aicode.service.ChatHistoryService;
import org.springframework.stereotype.Service;

/**
 * 对话历史 服务层实现。
 *
 * @author <a href="https://github.com/Ace6688">翘楚</a>
 */
@Service
public class ChatHistoryServiceImpl extends ServiceImpl<ChatHistoryMapper, ChatHistory>  implements ChatHistoryService{

}
