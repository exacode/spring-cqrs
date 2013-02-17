package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUsers is a Querydsl query type for QUsers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUsers extends com.mysema.query.sql.RelationalPathBase<QUsers> {

    private static final long serialVersionUID = 1551383108;

    public static final QUsers users = new QUsers("users");

    public final DateTimePath<java.sql.Timestamp> creationTime = createDateTime("creation_time", java.sql.Timestamp.class);

    public final StringPath email = createString("email");

    public final StringPath login = createString("login");

    public final DateTimePath<java.sql.Timestamp> modificationTime = createDateTime("modification_time", java.sql.Timestamp.class);

    public final StringPath password = createString("password");

    public final NumberPath<Long> userId = createNumber("user_id", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QUsers> usersPkey = createPrimaryKey(userId);

    public final com.mysema.query.sql.ForeignKey<QUserRoles> _userRolesUserIdFkey = createInvForeignKey(userId, "user_id");

    public QUsers(String variable) {
        super(QUsers.class, forVariable(variable), "public", "users");
    }

    @SuppressWarnings("all")
    public QUsers(Path<? extends QUsers> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "users");
    }

    public QUsers(PathMetadata<?> metadata) {
        super(QUsers.class, metadata, "public", "users");
    }

}

