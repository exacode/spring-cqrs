package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserRolesPkey is a Querydsl query type for QUserRolesPkey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserRolesPkey extends com.mysema.query.sql.RelationalPathBase<QUserRolesPkey> {

    private static final long serialVersionUID = 965795069;

    public static final QUserRolesPkey userRolesPkey = new QUserRolesPkey("user_roles_pkey");

    public final NumberPath<Long> roleId = createNumber("role_id", Long.class);

    public final NumberPath<Long> userId = createNumber("user_id", Long.class);

    public QUserRolesPkey(String variable) {
        super(QUserRolesPkey.class, forVariable(variable), "public", "user_roles_pkey");
    }

    @SuppressWarnings("all")
    public QUserRolesPkey(Path<? extends QUserRolesPkey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "user_roles_pkey");
    }

    public QUserRolesPkey(PathMetadata<?> metadata) {
        super(QUserRolesPkey.class, metadata, "public", "user_roles_pkey");
    }

}

