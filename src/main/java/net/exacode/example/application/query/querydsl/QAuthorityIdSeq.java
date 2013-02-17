package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuthorityIdSeq is a Querydsl query type for QAuthorityIdSeq
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAuthorityIdSeq extends com.mysema.query.sql.RelationalPathBase<QAuthorityIdSeq> {

    private static final long serialVersionUID = 663146245;

    public static final QAuthorityIdSeq authorityIdSeq = new QAuthorityIdSeq("authority_id_seq");

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

    public QAuthorityIdSeq(String variable) {
        super(QAuthorityIdSeq.class, forVariable(variable), "public", "authority_id_seq");
    }

    @SuppressWarnings("all")
    public QAuthorityIdSeq(Path<? extends QAuthorityIdSeq> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "authority_id_seq");
    }

    public QAuthorityIdSeq(PathMetadata<?> metadata) {
        super(QAuthorityIdSeq.class, metadata, "public", "authority_id_seq");
    }

}

