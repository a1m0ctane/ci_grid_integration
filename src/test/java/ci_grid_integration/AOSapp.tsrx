<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AOSapp</className>
    <objects>
        <object type="Page" technology="Web">
            <name>Advantage Shopping</name>
            <codeName>Homepage</codeName>
            <description></description>
            <identification/>
            <children>
                <object type="Link" technology="Web">
                    <name>UserMenu</name>
                    <codeName>UserMenu</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">A</property>
                            <property name="InnerText" type="string" isRegExp="false">My account My orders Sign out </property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="Web">
                    <name>username</name>
                    <codeName>Username</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">username</property>
                            <property name="Type" type="string" isRegExp="false">text</property>
                        </properties>
                    </identification>
                    <tags>
                        <tag>Order</tag>
                    </tags>
                </object>
                <object type="EditField" technology="Web">
                    <name>password</name>
                    <codeName>Password</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">password</property>
                            <property name="Type" type="string" isRegExp="false">password</property>
                        </properties>
                    </identification>
                    <tags>
                        <tag>Login</tag>
                    </tags>
                </object>
                <object type="Button" technology="Web">
                    <name>sign_in_btnundefined</name>
                    <codeName>Login</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                            <property name="Name" type="string" isRegExp="false">SIGN IN</property>
                            <property name="ButtonType" type="string" isRegExp="false">button</property>
                        </properties>
                    </identification>
                    <tags>
                        <tag>Login</tag>
                    </tags>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
