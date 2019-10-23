package Tchat.mapper;

import java.util.List;
import Tchat.domain.FriendsRequest;
import Tchat.domain.FriendsRequestExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FriendsRequestMapper {
    int countByExample(FriendsRequestExample example);

    int deleteByExample(FriendsRequestExample example);

    int deleteByPrimaryKey(String id);

    int insert(FriendsRequest record);

    int insertSelective(FriendsRequest record);

    List<FriendsRequest> selectByExample(FriendsRequestExample example);

    FriendsRequest selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    int updateByExample(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    int updateByPrimaryKeySelective(FriendsRequest record);

    int updateByPrimaryKey(FriendsRequest record);
}