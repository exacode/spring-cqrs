package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUsersPkey is a Querydsl query type for QUsersPkey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUsersPkey extends com.mysema.query.sql.RelationalPathBase<QUsersPkey> {

    private static final long serialVersionUID = -1783663533;

    public static final QUsersPkey usersPkey = new QUsersPkey("users_pkey");

    public final NumberPath<Long> userId = createNumber("user_id", Long.class);

    public QUsersPkey(String variable) {
        super(QUsersPkey.class, forVariable(variable), "public", "users_pkey");
    }

    @SuppressWarnings("all")
    public QUsersPkey(Path<? extends QUsersPkey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "users_pkey");
    }

    public QUsersPkey(PathMetadata<?> metadata) {
        super(QUsersPkey.class, metadata, "public", "users_pkey");
    }

}

