package com.example.demo.domain.wexin.request;

import lombok.Data;

import java.util.List;
@Data
public class Source {
    // 消息来自群聊的对象
    private Room room;

    // 消息来自个人的对象
    private To to;

    // 消息发送方的对象
    private From from;

    // Getters and Setters
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    // 群聊信息的类
    public static class Room {
        // 群的唯一ID
        private String id;

        // 群的名称
        private String topic;

        // 群的详细信息
        private Payload payload;

        // 用于事件的占位符
        private Object _events;

        // 事件计数
        private int _eventsCount;

        // Getters and Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public Payload getPayload() {
            return payload;
        }

        public void setPayload(Payload payload) {
            this.payload = payload;
        }

        public Object get_events() {
            return _events;
        }

        public void set_events(Object _events) {
            this._events = _events;
        }

        public int get_eventsCount() {
            return _eventsCount;
        }

        public void set_eventsCount(int _eventsCount) {
            this._eventsCount = _eventsCount;
        }

        // 群聊中的成员信息
        public static class Payload {
            // 群的唯一ID
            private String id;

            // 群管理员ID列表
            private List<String> adminIdList;

            // 群头像，相对路径，需要配合解密
            private String avatar;

            // 群成员列表
            private List<Member> memberList;

            // Getters and Setters
            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<String> getAdminIdList() {
                return adminIdList;
            }

            public void setAdminIdList(List<String> adminIdList) {
                this.adminIdList = adminIdList;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public List<Member> getMemberList() {
                return memberList;
            }

            public void setMemberList(List<Member> memberList) {
                this.memberList = memberList;
            }

            // 群成员类
            public static class Member {
                // 成员的唯一ID
                private String id;

                // 成员的头像
                private String avatar;

                // 成员的名称（昵称）
                private String name;

                // 成员的备注名
                private String alias;

                // Getters and Setters
                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlias() {
                    return alias;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }
            }
        }
    }

    // 消息接收人的信息
    public static class To {
        // 接收者的ID
        private String id;

        // 接收者的详细信息
        private Payload payload;

        // 用于事件的占位符
        private Object _events;

        // 事件计数
        private int _eventsCount;

        // Getters and Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Payload getPayload() {
            return payload;
        }

        public void setPayload(Payload payload) {
            this.payload = payload;
        }

        public Object get_events() {
            return _events;
        }

        public void set_events(Object _events) {
            this._events = _events;
        }

        public int get_eventsCount() {
            return _eventsCount;
        }

        public void set_eventsCount(int _eventsCount) {
            this._eventsCount = _eventsCount;
        }

        // 接收者详细信息
        public static class Payload {
            // 接收者的备注名
            private String alias;

            // 接收者的头像
            private String avatar;

            // 是否是好友
            private boolean friend;

            // 性别：1为男性，2为女性
            private int gender;

            // 接收者的唯一ID
            private String id;

            // 接收者的名称（昵称）
            private String name;

            // 接收者的电话列表
            private List<String> phone;

            // 接收者的签名
            private String signature;

            // 是否是星标联系人
            private boolean star;

            // 类型标识
            private int type;

            // Getters and Setters
            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public boolean isFriend() {
                return friend;
            }

            public void setFriend(boolean friend) {
                this.friend = friend;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getPhone() {
                return phone;
            }

            public void setPhone(List<String> phone) {
                this.phone = phone;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public boolean isStar() {
                return star;
            }

            public void setStar(boolean star) {
                this.star = star;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }

    // 消息发送方的信息
    public static class From {
        // 发送者的ID
        private String id;

        // 发送者的详细信息
        private Payload payload;

        // 用于事件的占位符
        private Object _events;

        // 事件计数
        private int _eventsCount;

        // Getters and Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Payload getPayload() {
            return payload;
        }

        public void setPayload(Payload payload) {
            this.payload = payload;
        }

        public Object get_events() {
            return _events;
        }

        public void set_events(Object _events) {
            this._events = _events;
        }

        public int get_eventsCount() {
            return _eventsCount;
        }

        public void set_eventsCount(int _eventsCount) {
            this._eventsCount = _eventsCount;
        }

        // 发送者详细信息
        public static class Payload {
            // 发送者的备注名
            private String alias;

            // 发送者的头像
            private String avatar;

            // 发送者的城市
            private String city;

            // 是否是好友
            private boolean friend;

            // 发送者的性别
            private int gender;

            // 发送者的唯一ID
            private String id;

            // 发送者的名称（昵称）
            private String name;

            // 发送者的电话列表
            private List<String> phone;

            // 发送者的省份
            private String province;

            // 是否是星标联系人
            private boolean star;

            // 类型标识
            private int type;

            // Getters and Setters
            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public boolean isFriend() {
                return friend;
            }

            public void setFriend(boolean friend) {
                this.friend = friend;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getPhone() {
                return phone;
            }

            public void setPhone(List<String> phone) {
                this.phone = phone;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public boolean isStar() {
                return star;
            }

            public void setStar(boolean star) {
                this.star = star;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}

