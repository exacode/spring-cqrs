package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUsersEmailKey is a Querydsl query type for QUsersEmailKey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUsersEmailKey extends com.mysema.query.sql.RelationalPathBase<QUsersEmailKey> {

    private static final long serialVersionUID = 2030305159;

    public static final QUsersEmailKey usersEmailKey = new QUsersEmailKey("users_email_key");

    public final StringPath email = createString("email");

    public QUsersEmailKey(String variable) {
        super(QUsersEmailKey.class, forVariable(variable), "public", "users_email_key");
    }

    @SuppressWarnings("all")
    public QUsersEmailKey(Path<? extends QUsersEmailKey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "users_email_key");
    }

    public QUsersEmailKey(PathMetadata<?> metadata) {
        super(QUsersEmailKey.class, metadata, "public", "users_email_key");
    }

}

