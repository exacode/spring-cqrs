package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUsersLoginKey is a Querydsl query type for QUsersLoginKey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUsersLoginKey extends com.mysema.query.sql.RelationalPathBase<QUsersLoginKey> {

    private static final long serialVersionUID = -1003049830;

    public static final QUsersLoginKey usersLoginKey = new QUsersLoginKey("users_login_key");

    public final StringPath login = createString("login");

    public QUsersLoginKey(String variable) {
        super(QUsersLoginKey.class, forVariable(variable), "public", "users_login_key");
    }

    @SuppressWarnings("all")
    public QUsersLoginKey(Path<? extends QUsersLoginKey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "users_login_key");
    }

    public QUsersLoginKey(PathMetadata<?> metadata) {
        super(QUsersLoginKey.class, metadata, "public", "users_login_key");
    }

}

