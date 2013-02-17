package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoleIdSeq is a Querydsl query type for QRoleIdSeq
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoleIdSeq extends com.mysema.query.sql.RelationalPathBase<QRoleIdSeq> {

    private static final long serialVersionUID = -1825377110;

    public static final QRoleIdSeq roleIdSeq = new QRoleIdSeq("role_id_seq");

    public final NumberPath<Long> cacheValue = createNumber("cache_value", Long.class);

    public final NumberPath<Long> incrementBy = createNumber("increment_by", Long.class);

    public final BooleanPath isCalled = createBoolean("is_called");

    public final BooleanPath isCycled = createBoolean("is_cycled");

    public final NumberPath<Long> lastValue = createNumber("last_value", Long.class);

    public final NumberPath<Long> logCnt = createNumber("log_cnt", Long.class);

    public final NumberPath<Long> maxValue = createNumber("max_value", Long.class);

    public final NumberPath<Long> minValue = createNumber("min_value", Long.class);

    public final StringPath sequenceName = createString("sequence_name");

    public final NumberPath<Long> startValue = createNumber("start_value", Long.class);

    public QRoleIdSeq(String variable) {
        super(QRoleIdSeq.class, forVariable(variable), "public", "role_id_seq");
    }

    @SuppressWarnings("all")
    public QRoleIdSeq(Path<? extends QRoleIdSeq> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "role_id_seq");
    }

    public QRoleIdSeq(PathMetadata<?> metadata) {
        super(QRoleIdSeq.class, metadata, "public", "role_id_seq");
    }

}

