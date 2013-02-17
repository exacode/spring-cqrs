package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuthorities is a Querydsl query type for QAuthorities
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAuthorities extends com.mysema.query.sql.RelationalPathBase<QAuthorities> {

    private static final long serialVersionUID = 904241757;

    public static final QAuthorities authorities = new QAuthorities("authorities");

    public final NumberPath<Long> authorityId = createNumber("authority_id", Long.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QAuthorities> authoritiesPkey = createPrimaryKey(authorityId);

    public final com.mysema.query.sql.ForeignKey<QRoleAuthorities> _roleAuthoritiesAuthorityIdFkey = createInvForeignKey(authorityId, "authority_id");

    public QAuthorities(String variable) {
        super(QAuthorities.class, forVariable(variable), "public", "authorities");
    }

    @SuppressWarnings("all")
    public QAuthorities(Path<? extends QAuthorities> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "authorities");
    }

    public QAuthorities(PathMetadata<?> metadata) {
        super(QAuthorities.class, metadata, "public", "authorities");
    }

}

